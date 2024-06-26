package com.alura.conversorapp.Model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record DataExchangeRateAPI(
        @SerializedName("base_code") String baseCcode,
        @SerializedName("conversion_rates") Map<String, Double> conversionRates) {


}
