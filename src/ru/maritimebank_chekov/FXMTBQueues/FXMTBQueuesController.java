package ru.maritimebank_chekov.FXMTBQueues;

import javafx.fxml.FXML;
import ru.inversion.bicomp.pref.PreferencesWorker;
import ru.inversion.dataset.XXIDataSet;
import ru.inversion.dataset.fx.DSFXAdapter;
import ru.inversion.fx.form.ActionFactory;
import ru.inversion.fx.form.JInvFXBrowserController;
import ru.inversion.fx.form.controls.*;
import ru.maritimebank_chekov.FXMTBQueues.data.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.EnumSet;

public class FXMTBQueuesController extends JInvFXBrowserController  {

    private static final class LinkDataAndTable<R>{
        final XXIDataSet<R> dataSet;
        final JInvTable<R> table;
        final String[] predicts;

        public LinkDataAndTable(final XXIDataSet<R> dataSet, final JInvTable<R> table, final String[] predicts) throws Exception {
            if(predicts.length != ElementStatus.values().length) throw new Exception("Number of predictors should be " + ElementStatus.values().length);
            this.dataSet = dataSet;
            this.table = table;
            this.predicts = predicts;
        }

        public void setFilterStatus(ElementStatus status) {
            dataSet.setWherePredicat(predicts[status.ordinal()]);
        }

        public void doRefresh () {
            table.executeQuery ();
        }

    }

    private final ArrayList<LinkDataAndTable<?>> dsMTBVXD = new ArrayList<>();

    @FXML private JInvTable<PXximtbLog> MTBVXD_LOG;
    private final XXIDataSet<PXximtbLog>   dsMTBVXD_LOG    = new XXIDataSet<> ();

    @FXML private JInvTable<PMtbqFxProblem> MTBVXD_PROBLEM;
    @FXML private JInvTable<PXximtbSparkRisk> MTBVXD_RISK;
    @FXML private JInvTable<PMtbsparkQ> MTBVXD_SPARK_Q;
    @FXML private JInvTable<PXximtbCamWsQ2> MTBVXD_CAM_WS_Q2;
    @FXML private JInvTable<PMtbcsVcwsQ> MTBVXD_VCWS_Q;
    @FXML private JInvTable<PMtbgcPayQ> MTBVXD_PAY_Q;
    @FXML private JInvTable<PMtbcardPayQ> MTBVXD_CARD_PAY_Q;
    @FXML private JInvTable<PMtbcardPayMsg> MTBVXD_CARD_PAY_MSG;
    @FXML private JInvTable<PMtbftcInQ> MTBVXD_IN_Q;
    @FXML private JInvTable<PMtbftcStmQ> MTBVXD_STM_Q;
    @FXML private JInvTable<PXxicbsQueryRegTmp> MTBVXD_QUERY_REG_TMP;
    @FXML private JInvTable<PXximtbDepositQ> MTBVXD_DEPOSIT_Q;
    @FXML private JInvTable<PXximtbQueuesIdbank> MTBVXD_QUEUES_IDBANK;
    @FXML private JInvTable<PMtbcheckFl> MTBVXD_CHECK_FL;
    @FXML private JInvTable<PMtbvMsgState> MTBVXD_MSG_STATE;
    @FXML private JInvTable<PMtbmpDepReq> MTBVXD_MP_DEP_REQ;
    @FXML private JInvTable<PMtbmpDepEvent> MTBVXD_MP_DEP_EVENT;
    @FXML private JInvTable<PGateOutgoDocument> MTBVXD_GO_DOCUMENT;
    @FXML private JInvTable<PXximtbCurOrder> MTBVXD_CUR_ORDER;
    @FXML private JInvTable<PMtbdboMicexTrnDel> MTBVXD_DBO_MICEX_TRN_DEL;
    @FXML private JInvTable<PMtbdboMicexTrnAff> MTBVXD_DBO_MICEX_TRN_AFF;
    @FXML private JInvTable<PMtbjcpQ> MTBVXD_JCP_Q;
    @FXML private JInvTable<PMtbbankApiCall> MTBVXD_API_CALL;

    @FXML private JInvTextArea BIG_TEXT;

    @FXML private JInvToolBar toolBar;

    @FXML
    private JInvCalendar PERIOD_START,PERIOD_END;

    @FXML private JInvComboBox<String, String> FILTER_STATUS;

    private enum ElementStatus {
        ALL("Все"), GOOD("Хорошие"), BAD("Плохие")
        ;

        private final String status;

        ElementStatus(final String code){
            this.status = code;
        }

        @Override
        public String toString() {
            return status;
        }
    }

    private final POptions pv = new POptions ();

    @Override
    protected void afterInit() {
        pv.setPERIOD_START(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        pv.setPERIOD_END(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));

        PERIOD_START.valueProperty().addListener( (v,o,n) -> {
            if (PERIOD_START.getValue() != null){
                pv.setPERIOD_START((PERIOD_START.getValue().format(DateTimeFormatter.ofPattern("yyyyMMdd"))));
                try{
                    PreferencesWorker.save(taskContext,pv);
                }catch (Exception e){
                    handleException(e);
                }
            }
        } );

        PERIOD_END.valueProperty().addListener( (v,o,n) -> {
            if (PERIOD_END.getValue() != null){
                pv.setPERIOD_END((PERIOD_END.getValue().format(DateTimeFormatter.ofPattern("yyyyMMdd"))));
                try{
                    PreferencesWorker.save(taskContext,pv);
                }catch (Exception e){
                    handleException(e);
                }
            }
        } );
    }

    @Override
    protected void init() throws Exception {
        setTitle (getBundleString ("VIEW.TITLE"));
        PreferencesWorker.load (getTaskContext (), pv);
        initFilterStatus();
        initDataSet();
        setJInvCalendar(PERIOD_START, pv.getPERIOD_START());
        setJInvCalendar(PERIOD_END, pv.getPERIOD_END());
        bindDSFX();
        toolBar.setStandartActions(ActionFactory.ActionTypeEnum.REFRESH,
                ActionFactory.ActionTypeEnum.DELETE);
        MTBVXD_LOG.setToolBar(toolBar);
        MTBVXD_LOG.setAction(ActionFactory.ActionTypeEnum.DELETE, (a) -> dsMTBVXD_LOG.removeCurrentRow ());
        for(LinkDataAndTable<?> element : dsMTBVXD) {
            element.table.setToolBar(toolBar);
            element.table.setAction(ActionFactory.ActionTypeEnum.REFRESH, (a) -> element.doRefresh());
            element.setFilterStatus(ElementStatus.BAD);
            element.doRefresh();
        }
        // TODO добавить раскрашевания строк
        // TODO добавить получения всего текста из CLOB или BLOB в BIG_TEXT. Удалять при изменении
    }

    private void initFilterStatus(){
        FILTER_STATUS.getItems().setAll(String.valueOf(EnumSet.allOf(ElementStatus.class)));
        FILTER_STATUS.setValue(ElementStatus.BAD.status);
        FILTER_STATUS.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equalsIgnoreCase(ElementStatus.ALL.status)){
                setFilterStatusAllTable(ElementStatus.ALL);
            }
            else if(newValue.equalsIgnoreCase(ElementStatus.GOOD.status)){
                setFilterStatusAllTable(ElementStatus.GOOD);
            }
            else if(newValue.equalsIgnoreCase(ElementStatus.BAD.status)){
                setFilterStatusAllTable(ElementStatus.BAD);
            }
        });

    }

    private void setFilterStatusAllTable(ElementStatus status){
        for(LinkDataAndTable<?> element : dsMTBVXD) {
            element.setFilterStatus(status);
            element.doRefresh();
        }
    }

    private void initDataSet () throws Exception {
        dsMTBVXD_LOG.setTaskContext (getTaskContext ());
        dsMTBVXD_LOG.setRowClass (PXximtbLog.class);
        dsMTBVXD.add(new LinkDataAndTable<>(dsMTBVXD_LOG, MTBVXD_LOG,
                new String[] {"NSTATUS=NSTATUS", "NSTATUS >= 0", "NSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<>(getTaskContext(), PMtbqFxProblem.class), MTBVXD_PROBLEM,
                new String[]{"P_ID=P_ID", "P_ID=P_ID", "P_ID=P_ID"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PXximtbSparkRisk.class),MTBVXD_RISK,
                new String[] {"CRESPONSE=CRESPONSE", "CRESPONSE IS NOT NULL", "CRESPONSE IS NULL"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbsparkQ.class),MTBVXD_SPARK_Q,
                new String[] {"CSQSTATE=CSQSTATE", "CSQSTATE = 2", "CSQSTATE <> 2"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PXximtbCamWsQ2.class),MTBVXD_CAM_WS_Q2,
                new String[] {"NSTATUS=NSTATUS", "NSTATUS >= 0", "NSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbcsVcwsQ.class),MTBVXD_VCWS_Q,
                new String[] {"CVCWSSTATE=CVCWSSTATE", "CVCWSSTATE >= 0", "CVCWSSTATE < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbgcPayQ.class),MTBVXD_PAY_Q,
                new String[] {"CGCPSTATUS=CGCPSTATUS", "CGCPSTATUS >= 0", "CGCPSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbcardPayQ.class),MTBVXD_CARD_PAY_Q,
                new String[] {"CCPSTATUS=CCPSTATUS", "CCPSTATUS >= 0", "CCPSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbcardPayMsg.class),MTBVXD_CARD_PAY_MSG,
                new String[] {"CCPMCHECK=CCPMCHECK", "LOWER(CCPMCHECK) = 'valid'", "LOWER(CCPMCHECK) <> 'valid'"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbftcInQ.class),MTBVXD_IN_Q,
                new String[] {"IFIQSTATUS=IFIQSTATUS", "IFIQSTATUS >= 0", "IFIQSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbftcStmQ.class),MTBVXD_STM_Q,
                new String[] {"ISTATUS=ISTATUS", "ISTATUS >= 0", "ISTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PXxicbsQueryRegTmp.class),MTBVXD_QUERY_REG_TMP,
                new String[] {"CRETCODE=CRETCODE", "CRETCODE = 0", "CRETCODE <> 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PXximtbDepositQ.class),MTBVXD_DEPOSIT_Q,
                new String[] {"NSTATUS=NSTATUS", "NSTATUS >= 0", "NSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PXximtbQueuesIdbank.class),MTBVXD_QUEUES_IDBANK,
                new String[] {"STATUS=STATUS", "STATUS >= 0", "STATUS < 0"}));

        // CHECK_EXTREM<>CHECK_EXTREM При фильтре GOOD -> не показываем ничего
        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbcheckFl.class),MTBVXD_CHECK_FL,
                new String[] {"CHECK_EXTREM=CHECK_EXTREM", "CHECK_EXTREM <> CHECK_EXTREM", "CHECK_EXTREM IS NULL OR CHECK_PASP IS NULL"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbvMsgState.class),MTBVXD_MSG_STATE,
                new String[] {"STATE_CODE=STATE_CODE", "STATE_CODE = 2 OR STATE_CODE = 250", "STATE_CODE <> 2 AND STATE_CODE <> 250"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbmpDepReq.class),MTBVXD_MP_DEP_REQ,
                new String[] {"IMDRSTATUS=IMDRSTATUS", "IMDRSTATUS >= 0", "IMDRSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbmpDepEvent.class),MTBVXD_MP_DEP_EVENT,
                new String[] {"IMDESTATUS=IMDESTATUS", "IMDESTATUS >= 0", "IMDESTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PGateOutgoDocument.class), MTBVXD_GO_DOCUMENT,
                new String[] {"IGODOCSTATE=IGODOCSTATE", "IGODOCSTATE >= 0", "IGODOCSTATE < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PXximtbCurOrder.class), MTBVXD_CUR_ORDER,
                new String[] {"NSTATUS=NSTATUS", "NSTATUS >= 0", "NSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbdboMicexTrnDel.class), MTBVXD_DBO_MICEX_TRN_DEL,
                new String[] {"ISTATE=ISTATE", "ISTATE >= 0", "ISTATE < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbdboMicexTrnAff.class), MTBVXD_DBO_MICEX_TRN_AFF,
                new String[] {"ISTATE=ISTATE", "ISTATE >= 0", "ISTATE < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbjcpQ.class), MTBVXD_JCP_Q,
                new String[] {"CJCPSTATUS=CJCPSTATUS", "CJCPSTATUS >= 0", "CJCPSTATUS < 0"}));

        dsMTBVXD.add(new LinkDataAndTable<>(new XXIDataSet<> (getTaskContext(), PMtbbankApiCall.class), MTBVXD_API_CALL,
                new String[] {"IBACSTATUS=IBACSTATUS", "IBACSTATUS >= 0", "IBACSTATUS < 0"}));

    }

    private void setJInvCalendar(final JInvCalendar calendar, final String date){
        calendar.setValue(LocalDate.of(
                Integer.parseInt(date.substring(0,4))
                ,Integer.parseInt(date.substring(4,6))
                ,Integer.parseInt(date.substring(6,8))));
    }

    private void bindDSFX() throws Exception {
        for(LinkDataAndTable element : dsMTBVXD){
            DSFXAdapter.bind (element.dataSet, element.table,
                    null, false).setEnableFilter (true);
        }
    }

}
