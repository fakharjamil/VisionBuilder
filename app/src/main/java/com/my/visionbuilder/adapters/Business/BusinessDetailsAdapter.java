package com.my.visionbuilder.adapters.Business;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.my.visionbuilder.R;
import com.my.visionbuilder.activities.Finance.Banking.BankingTransactionsActivity;
import com.my.visionbuilder.activities.Finance.Education.EducationActivity;
import com.my.visionbuilder.activities.Finance.HouseFinance.HouseFinanceActivity;
import com.my.visionbuilder.activities.Finance.Income.IncomeActivity;
import com.my.visionbuilder.activities.Finance.Insurance.InsuranceActivity;
import com.my.visionbuilder.activities.Finance.StockAndBond.StockAndBondActivity;
import com.my.visionbuilder.activities.Loans.LoansActivity;
import com.my.visionbuilder.activities.Medical.MedicalActivity;
import com.my.visionbuilder.activities.SavingPlan.SavingPlanActivity;
import com.my.visionbuilder.activities.Shopping.ShoppingActivity;
import com.my.visionbuilder.activities.Transportation.TransportationActivity;
import com.my.visionbuilder.adapters.FinanceAdapter.FinanceAdapter;
import com.my.visionbuilder.models.BusinessNavigation;
import com.my.visionbuilder.models.FinanceNavigation;

import java.util.ArrayList;

public class BusinessDetailsAdapter extends RecyclerView.Adapter<BusinessDetailsAdapter.MyViewHolder> {
    public static final int VIEW_TYPE_LONG = 0;
    public static final int VIEW_TYPE_SMALL = 1;
    int checkView;
    Context context;
    ArrayList<BusinessNavigation> list;
    private BusinessDetailsAdapter.OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(BusinessDetailsAdapter.OnItemClickListener listener) {
        mListener = listener;
    }

    public BusinessDetailsAdapter(Context context, ArrayList<BusinessNavigation> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public BusinessDetailsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_LONG) {
            checkView = 1;
            return new BusinessDetailsAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigation_business_long, parent, false));
        } else {
            return new BusinessDetailsAdapter.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.navigation_business_small, parent, false));
        }
    }

    public void onBindViewHolder(@NonNull final BusinessDetailsAdapter.MyViewHolder holder, final int position) {
        switch (list.get(position).getNavigation_Title()) {
            case "Monthly Bills":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_HouseFinance));
                break;
            case "Business Bio":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Banking));
                break;
            case "Business Goals":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Medical));
                break;
            case "Business Plans":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Shopping));
                break;
            case "Business Contacts":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Loans));
                break;
            case "Business Spreadsheet\n Templates":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Transport));
                break;
            case "Business Meetings":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_SavingPlan));
                break;
            case "Business Travel":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Education));
                break;
            case "Business Income\n Taker":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Insurance));
                break;
            case "Business Investments":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_StockAndBond));
                break;
            case "Business Training":
                holder.nav_Layout.setBackgroundTintList(context.getResources().getColorStateList(R.color.bg_Income));
                break;
            default:
                break;
        }
        holder.navigation_Icon.setImageResource(list.get(position).getNavigation_Icon());
        holder.navigation_Title.setText(list.get(position).getNavigation_Title());
        holder.nav_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (list.get(position).getNavigation_Title()) {
                    case "Monthly Bills":
                        Intent intent = new Intent(context, HouseFinanceActivity.class);
                        context.startActivity(intent);
                        break;
                    case "Banking":
                        Intent intent1 = new Intent(context, BankingTransactionsActivity.class);
                        context.startActivity(intent1);
                        break;
                    case "Medical":
                        Intent intent2 = new Intent(context, MedicalActivity.class);
                        context.startActivity(intent2);
                        break;
                    case "Shopping":
                        Intent intent3 = new Intent(context, ShoppingActivity.class);
                        context.startActivity(intent3);
                        break;
                    case "Loans":
                        Intent intent4 = new Intent(context, LoansActivity.class);
                        context.startActivity(intent4);
                        break;
                    case "Transport":
                        Intent intent5 = new Intent(context, TransportationActivity.class);
                        context.startActivity(intent5);
                        break;
                    case "Saving \n" + "Plan":
                        Intent intent6 = new Intent(context, SavingPlanActivity.class);
                        context.startActivity(intent6);
                        break;
                    case "Education":
                        Intent intent7 = new Intent(context, EducationActivity.class);
                        context.startActivity(intent7);
                        break;
                    case "Insurance":
                        Intent intent8 = new Intent(context, InsuranceActivity.class);
                        context.startActivity(intent8);
                        break;
                    case "Stock And\n" + "Bond":
                        Intent intent9 = new Intent(context, StockAndBondActivity.class);
                        context.startActivity(intent9);
                        break;
                    case "Income":
                        Intent intent10 = new Intent(context, IncomeActivity.class);
                        context.startActivity(intent10);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView navigation_Title, details;
        ImageView navigation_Icon;
        RelativeLayout nav_Layout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            navigation_Title = itemView.findViewById(R.id.navigation_Title);
            details = itemView.findViewById(R.id.details);
            navigation_Icon = itemView.findViewById(R.id.navigation_Icon);
            nav_Layout = itemView.findViewById(R.id.nav_Layout);
            nav_Layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 1 || position == 2 || position == 3 || position == 5 || position == 6 || position == 9 || position == 10) {
            return VIEW_TYPE_SMALL;
        } else {
            return VIEW_TYPE_LONG;
        }
    }
}