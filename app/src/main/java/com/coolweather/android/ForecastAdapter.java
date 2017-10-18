package com.coolweather.android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coolweather.android.gson.HourlyForecast;

import java.util.List;

/**
 * Created by AlanShelby on 2017/10/18.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ViewHolder> {

    private List<HourlyForecast> forecastList;

    public ForecastAdapter(List<HourlyForecast> forecastList) {
        this.forecastList = forecastList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_forecast_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        HourlyForecast hourlyForecast = forecastList.get(position);
        holder.hourText.setText(hourlyForecast.getDate());
        holder.hourDegreeText.setText(hourlyForecast.getTemperature());
    }

    @Override
    public int getItemCount() {
        return forecastList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView hourText;
        TextView hourDegreeText;

        public ViewHolder(View itemView) {
            super(itemView);
            hourText = (TextView) itemView.findViewById(R.id.hour_text);
            hourDegreeText = (TextView) itemView.findViewById(R.id.hour_degree_text);
        }
    }

}
