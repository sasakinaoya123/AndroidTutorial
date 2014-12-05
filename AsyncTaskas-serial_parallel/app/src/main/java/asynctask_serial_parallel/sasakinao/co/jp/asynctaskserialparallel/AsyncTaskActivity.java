package asynctask_serial_parallel.sasakinao.co.jp.asynctaskserialparallel;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;


public class AsyncTaskActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);


        AsyncTask task1 = new AsyncTask() {

            @Override
            protected Object doInBackground(Object[] objects) {
                Log.v("task1", "start!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);
                Log.v("task1", "done!!!");
            }
        }
                .execute();
        //.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);


        AsyncTask task2 = new AsyncTask() {

            @Override
            protected Object doInBackground(Object[] objects) {
                Log.v("task2", "start!!!");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);
                Log.v("task2", "done!!!");
            }
        }
                .execute();
        //.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
