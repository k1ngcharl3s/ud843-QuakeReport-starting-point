package com.example.android.quakereport;

public class Earthquake {

    /**
     * {@link Earthquake} contains the information that is associated with the earthquake
     * Each object has 3 properties: magnitude, location, and date.
     */


        // Magnitude of the earthquake
        private double mMagnitude;

        // Location of the earthquake
        private String mLocation;

        // Time of the earthquake
        private long mTimeInMilliseconds;

        /*
         * Constructs a new
         *
         * @param magnitude is the size of the earthquake
         * @param location is place that the vent happened
         * @param timeInMilliseconds is the time in milliseconds of the earthquake
         * */
        public Earthquake (double magnitude, String location, long timeInMilliseconds)
        {
            mMagnitude = magnitude;
            mLocation = location;
            mTimeInMilliseconds = timeInMilliseconds;
        }

        /**
         * Get the name of the magnitude of the earthquake
         */
        public double getMagnitude() { return mMagnitude; }

        /**
         * Get the location of the earthquake
         */
        public String getLocation() { return mLocation; }

        /**
         * Get the date of the earthquake
         */
        public long getTimeInMilliseconds() { return mTimeInMilliseconds; }


    }
