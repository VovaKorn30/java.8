package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class WeatherAnalysisTest {

    private TemperatureAnalysis temperatureAnalysis;
    private PrecipitationAnalysis precipitationAnalysis;

    @BeforeEach
    public void setUp() {
        temperatureAnalysis = new TemperatureAnalysis();
        precipitationAnalysis = new PrecipitationAnalysis();
    }

    @Test
    public void testTemperatureAnalysis() {
        testAnalysis(temperatureAnalysis.getTemperatureDataList());
    }

    @Test
    public void testPrecipitationAnalysis() {
        testAnalysis(precipitationAnalysis.getPrecipitationDataList());
    }

    private void testAnalysis(List<DataEntry> dataList) {
        dataList.forEach(entry -> System.out.println(entry)); // Placeholder for any specific test logic

        assertFalse(dataList.isEmpty());

        assertTrue(isSortedDescending(dataList));
    }

    private boolean isSortedDescending(List<DataEntry> dataList) {
        for (int i = 1; i < dataList.size(); i++) {
            if (dataList.get(i - 1).getValue() < dataList.get(i).getValue()) {
                return false;
            }
        }
        return true;
    }
}
