package com.adapter.smart.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanNoObjI;
import com.adapter.smart.utils.UtilWidget;
import com.smart.holder_library.CommonAdapter;

/**
 * Created by smart on 2017/4/26.
 */

public class NoObjIViewHolderHelper implements CommonAdapter.IViewHolderHelperCallback<NoObjViewHolder,BeanNoObjI> {
    @Override
    public CommonAdapter.IBaseViewHolder initViewHolder(NoObjViewHolder viewHolder, @NonNull View convertView) {
        viewHolder = new NoObjViewHolder();
        viewHolder.name = UtilWidget.getView(convertView, R.id.id_name);
        viewHolder.age = UtilWidget.getView(convertView,R.id.id_age);
        viewHolder.msg = UtilWidget.getView(convertView,R.id.id_msg);
        viewHolder.status = UtilWidget.getView(convertView,R.id.id_status);

        Log.i("xxx", "initViewHolder: ");
        return viewHolder;
    }

    @Override
    public void bindDataToView(Context context,  BeanNoObjI beanDataList, NoObjViewHolder viewHolder, int position) {
        viewHolder.name.setText("名字："+ beanDataList.getName());
        viewHolder.age.setText("年龄："+ beanDataList.getAge());
        Log.i("xxx", "bindDataToView: "+ beanDataList.getAge());
        viewHolder.status.setText("状态："+ beanDataList.getStatus());
        viewHolder.msg.setText("结果："+ beanDataList.getMsg());
    }

}
