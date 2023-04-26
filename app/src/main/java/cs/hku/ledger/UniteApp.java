package cs.hku.ledger;

import android.app.Application;

import cs.hku.ledger.db.DBManager;

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DBManager.initDB(getApplicationContext());
    }
}
