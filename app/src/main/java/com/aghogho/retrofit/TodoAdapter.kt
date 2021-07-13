package com.aghogho.retrofit

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aghogho.retrofit.databinding.TodoItemBinding

class TodoAdapter(var lsit:List<Todo>):RecyclerView.Adapter<TodoAdapter.TodoviewHolder>() {

    class TodoviewHolder(val binding: TodoItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(todo: Todo){
            binding.textView.text = todo.title
            if (todo.completed){
                binding.imageView.visibility = view.VISIBLE
            }else{
                binding.imageView.imageView.visibility = view.INVISIBLE
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoAdapter.TodoviewHolder {
        val layoutInflater
        val binding = TodoItemBinding.inflate(layoutInflater.from(parent.context))
        return
    }

    override fun onBindViewHolder(holder: TodoAdapter.TodoviewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }
}