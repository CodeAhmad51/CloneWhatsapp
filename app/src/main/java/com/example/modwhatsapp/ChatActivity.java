package com.example.modwhatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    ImageView send_button;
    EditText typ_msg_bar;

    Adapter adapter;
    List<String> messages;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        init();
    }

    private void init(){
        messages = new ArrayList<>();
        adapter = new Adapter(messages);
        recyclerView = findViewById(R.id.chat_screen);
        send_button = findViewById(R.id.send_button);
        typ_msg_bar = findViewById(R.id.chat_window);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String message = typ_msg_bar.getText().toString();
                 if (message.equals("trishan")){
                    messages.add(" naam mt type kr bohot bhosdika hai lauda");
                    adapter.notifyDataSetChanged();
                    recyclerView.smoothScrollToPosition(message.length()-1);
                    typ_msg_bar.setText("");
                }
                else if (message.equals("pradeep")) {
                     messages.add(" ldka apna doctor hai");
                     adapter.notifyDataSetChanged();
                     recyclerView.smoothScrollToPosition(message.length() - 1);
                     typ_msg_bar.setText("");
                 }

                   else if (message.equals("kunal")) {
                     messages.add(" meri ek loti olaad");
                     adapter.notifyDataSetChanged();
                     recyclerView.smoothScrollToPosition(message.length() - 1);
                     typ_msg_bar.setText("");
                 }

                      else if (message.equals("rohit")) {
                         messages.add(" apna sakht londa #aunty lover");
                         adapter.notifyDataSetChanged();
                         recyclerView.smoothScrollToPosition(message.length() - 1);
                         typ_msg_bar.setText("");
                     }

                          else if (message.equals("piyush")) {
                         messages.add(" lodu lalit");
                         adapter.notifyDataSetChanged();
                         recyclerView.smoothScrollToPosition(message.length() - 1);
                         typ_msg_bar.setText("");
                     }

               else if (message.length() >0){
                    messages.add(message);
                    adapter.notifyDataSetChanged();
                    recyclerView.smoothScrollToPosition(message.length()-1);
                    typ_msg_bar.setText("");
                }
            }
        });
    }
}