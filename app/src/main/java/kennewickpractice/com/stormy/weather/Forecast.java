package kennewickpractice.com.stormy.weather;

/**
 * Created by ken.wagner on 9/22/2015.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForecast;
    private Day[] mDailyForecast;


    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }
}
