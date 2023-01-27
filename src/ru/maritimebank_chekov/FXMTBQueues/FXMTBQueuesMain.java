package ru.maritimebank_chekov.FXMTBQueues;

import ru.inversion.fx.app.BaseApp;
import ru.inversion.fx.form.FXFormLauncher;
import ru.inversion.fx.form.ViewContext;
import ru.inversion.tc.TaskContext;

import java.util.Collections;
import java.util.Map;

public class FXMTBQueuesMain extends BaseApp {

    public static void main (String[] args)
    {
        launch (args);
    }

    @Override
    protected void showMainWindow ()
    {
        showFXMTBQueues (getPrimaryViewContext (), new TaskContext(), Collections.emptyMap ());
    }

    public static void showFXMTBQueues (ViewContext vc, TaskContext tc, Map<String, Object> p)
    {
        new FXFormLauncher<>(tc, vc, FXMTBQueuesController.class)
                .initProperties (p)
                .show ();
    }

    @Override
    public String getAppID ()
    {
        return "XXI.FXMTBQueues";
    }
}
