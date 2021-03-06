package com.osu.pzcg.carpool.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.osu.pzcg.carpool.Info.ListCard;
import com.osu.pzcg.carpool.R;

import java.util.List;

/**
 * Created by GoThumbers on 11/6/15.
 */
public class CardListAdpters extends BaseAdapter{

        private List<ListCard> mCards;
        private Context mContext;

        public CardListAdpters(Context mContext,List<ListCard> mCards)
        {
            this.mContext=mContext;
            this.mCards=mCards;
        }
        @Override
        public int getCount()
        {
            return mCards.size();
        }

        @Override
        public Object getItem(int index)
        {
            return mCards.get(index);
        }

        @Override
        public long getItemId(int index)
        {
            return index;
        }

        @Override
        public View getView(int index, View mView, ViewGroup mParent)
        {
            ViewHolder mHolder=new ViewHolder();
            mView= LayoutInflater.from(mContext).inflate(R.layout.list_card, null);
            mHolder.cardTitle=(TextView)mView.findViewById(R.id.name);
            mHolder.cardTitle.setText(mCards.get(index).getName());
            mHolder.cardTime=(TextView)mView.findViewById(R.id.time);
            mHolder.cardTime.setText(mCards.get(index).getTime());
            mHolder.depart=(TextView)mView.findViewById(R.id.departure);
            mHolder.depart.setText(mCards.get(index).getDeparture());
            mHolder.destin=(TextView)mView.findViewById(R.id.destination);
            mHolder.destin.setText(mCards.get(index).getDestination());
            mHolder.cardSeats=(TextView)mView.findViewById(R.id.seat_left);
            mHolder.cardSeats.setText(mCards.get(index).getSeats());
            return mView;
        }

        private static class ViewHolder
        {
            TextView cardTitle;
            TextView cardTime;
            TextView depart;
            TextView destin;
            TextView cardSeats;
        }


}
