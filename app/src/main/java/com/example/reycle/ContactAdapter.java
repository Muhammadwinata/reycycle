package com.example.reycle;

import

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private final LayoutInflater minflater;
    private List<ContactModel> contactList;
    private LayoutInflater layoutInflater;
    private Context context;
    final ContactAdapter.OnItemClickListener listener;

    public ContactAdapter(List<ContactModel> contactList, Context context, OnItemClickListener listener) {
        this.minflater = LayoutInflater.from(context);
        this.contactList = contactList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(@NoNull ViewGroup parent, int viewType) {
        View view =
    }
}
