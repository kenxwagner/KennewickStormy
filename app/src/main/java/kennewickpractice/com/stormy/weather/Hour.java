package kennewickpractice.com.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ken.wagner on 9/22/2015.
 */
public class Hour implements Parcelable{
    private long mTime;
    private  String mSummary;
    private double mTemperature;
    private String mIcon;
    private String mTimezone;
    private double mWindSpeed;

    public Hour() {}

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public double getWindSpeed() {
        return mWindSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        mWindSpeed = windSpeed;
}

    @Override
    public int describeContents() {
        return 0; // do not use
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong((mTime));
        dest.writeDouble(mTemperature);
        dest.writeString(mSummary);
        dest.writeString(mIcon);
        dest.writeString(mTimezone);

    }

    private Hour(Parcel in) {
        mTime = in.readLong();
        mTemperature = in.readDouble();
        mSummary = in.readString();
        mIcon = in.readString();
        mTimezone = in.readString();

    }

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel source) {
            return new Hour(source);
        }

        @Override
        public Hour[] newArray(int size) {
            return new Hour[size];
        }
    };
}
