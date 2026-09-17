package com.gursharan.ai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
  LinearLayout box; TextView status; EditText task;
  int dp(float n){return (int)(n*getResources().getDisplayMetrics().density+.5f);}
  TextView t(String s,int size){ TextView v=new TextView(this); v.setText(s); v.setTextSize(size); v.setTextColor(Color.rgb(17,24,39)); v.setPadding(dp(12),dp(8),dp(12),dp(8)); return v; }
  public void onCreate(Bundle b){super.onCreate(b);
    ScrollView scroll=new ScrollView(this); box=new LinearLayout(this); box.setOrientation(LinearLayout.VERTICAL); box.setPadding(dp(18),dp(24),dp(18),dp(24)); box.setBackgroundColor(Color.rgb(248,250,252));
    TextView h=t("GURSHARAN AI",28); h.setTextColor(Color.rgb(17,24,39)); h.setGravity(Gravity.CENTER); box.addView(h);
    TextView sub=t("Autonomous Assistant — Trial",15); sub.setGravity(Gravity.CENTER); box.addView(sub);
    box.addView(t("MASTER AGENT",18)); box.addView(t("Routes tasks to the right specialist agent and tracks progress.",14));
    task=new EditText(this); task.setHint("Enter a task..."); task.setMinLines(4); task.setGravity(Gravity.TOP); box.addView(task,new LinearLayout.LayoutParams(-1,dp(130)));
    Button run=new Button(this); run.setText("RUN AGENT"); box.addView(run);
    status=t("Ready — waiting for a task.",15); box.addView(status);
    String[] agents={"LinkedIn Agent","Freelancing Agent","Engineering Agent","Voice Agent","Task Manager","Files / Excel / PDF"};
    for(String a:agents){ TextView x=t("○  "+a+"   • Ready",15); box.addView(x); }
    run.setOnClickListener(v->{
      String q=task.getText().toString().trim();
      if(q.isEmpty()){status.setText("Please enter a task first."); return;}
      status.setText("Running: "+q+"\n\nMaster Agent → Planning\nSpecialist Agent → Preparing actions\nTask Manager → Tracking\n\nTRIAL MODE: No external website action or message is sent.");
    });
    scroll.addView(box); setContentView(scroll);
  }
}