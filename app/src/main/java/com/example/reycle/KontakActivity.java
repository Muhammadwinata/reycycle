package com.example.reycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class KontakActivity extends AppCompatActivity {

    List<ContactModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

        addData();
    }
    private void addData() {
        elements.add(new ContactModel("#46C8DA", "Winata", "08978761415", "Avaliable"));
        elements.add(new ContactModel("#C5DA46", "ilham", "08978761412", "Avaliable"));
        elements.add(new ContactModel("#DA4646", "Jeje", "08978761410", "Avaliable"));
        elements.add(new ContactModel("#9946da", "Bob", "08078761415", "Avaliable"));
        elements.add(new ContactModel("#98D696", "Roger", "08978861415", "Avaliable"));
        elements.add(new ContactModel("#96D6D2", "Nata", "08978561415", "Avaliable"));
        elements.add(new ContactModel("#C956D6", "Kim", "08928761415", "Avaliable"));
        elements.add(new ContactModel("#D6AD96", "Seoul", "08978761415", "Avaliable"));
        elements.add(new ContactModel("#C9D696", "Marsha", "08978761415", "Avaliable"));
        elements.add(new ContactModel("#96A4D6", "Dul", "08978761415", "Avaliable"));
    }
}