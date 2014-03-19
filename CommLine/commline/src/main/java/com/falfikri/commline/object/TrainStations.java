package com.falfikri.commline.object;

import android.location.Location;

import com.falfikri.commline.model.TrainStation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zakiy on 3/17/14.
 */
public class TrainStations {
    public static final TrainStation STASIUN_BOGOR = new TrainStation("Stasiun Bogor", -6.594591, 106.790589);
    public static final TrainStation STASIUN_CILEBUT = new TrainStation("Stasiun Cilebut", -6.530752, 106.800628);
    public static final TrainStation STASIUN_BOJONGGEDE = new TrainStation("Stasiun Bojonggede", -6.493352, 106.794960);
    public static final TrainStation STASIUN_CITAYAM = new TrainStation("Stasiun Citayam", -6.448898, 106.802354);
    public static final TrainStation STASIUN_DEPOK = new TrainStation("Stasiun Depok", -6.404194, 106.817201);
    public static final TrainStation STASIUN_DEPOK_BARU = new TrainStation("Stasiun Depok Baru", -6.391140, 106.821666);
    public static final TrainStation STASIUN_PONDOK_CINA = new TrainStation("Stasiun Pondok Cina",-6.369479, 106.831927);
    public static final TrainStation STASIUN_UNIVERSITAS_INDONESIA = new TrainStation("Stasiun Universitas Indonesia",-6.360460, 106.831778);
    public static final TrainStation STASIUN_UNIVERSITAS_PANCASILA = new TrainStation("Stasiun Universitas Pancasila",-6.339300, 106.834232);
    public static final TrainStation STASIUN_LENTENG_AGUNG = new TrainStation("Stasiun Lenteng Agung", -6.331466, 106.835094);
    public static final TrainStation STASIUN_TANJUNG_BARAT = new TrainStation("Stasiun Tanjung Barat", -6.308037, 106.838893);
    public static final TrainStation STASIUN_PASAR_MINGGU = new TrainStation("Stasiun Pasar Minggu", -6.283430, 106.844776);
    public static final TrainStation STASIUN_PASAR_MINGGU_BARU = new TrainStation("Stasiun Pasar Minggu Baru", -6.263185, 106.851557);
    public static final TrainStation STASIUN_DUREN_KALIBATA = new TrainStation("Stasiun Duren Kalibata", -6.255103, 106.855196);
    public static final TrainStation STASIUN_CAWANG = new TrainStation("Stasiun Cawang", -6.241997, 106.858627);
    public static final TrainStation STASIUN_TEBET = new TrainStation("Stasiun Tebet", -6.226220, 106.858386);
    public static final TrainStation STASIUN_MANGGARAI = new TrainStation("Stasiun Manggarai", -6.210385, 106.849956);
    public static final TrainStation STASIUN_SUDIRMAN = new TrainStation("Stasiun Sudirman", -6.202423, 106.823507);
    public static final TrainStation STASIUN_TANAH_ABANG = new TrainStation("Stasiun Tanah Abang",-6.185782, 106.810828);
    public static final TrainStation STASIUN_DURI = new TrainStation("Stasiun Duri",-6.155972, 106.801346);
    public static final TrainStation STASIUN_ANGKE = new TrainStation("Stasiun Angke",-6.144429, 106.800719);

    public static final List<TrainStation> getBogorSudirmanStations(){
        List<TrainStation> trainStations = new ArrayList<TrainStation>();
        trainStations.add(STASIUN_BOGOR);
        trainStations.add(STASIUN_CILEBUT);
        trainStations.add(STASIUN_BOJONGGEDE);
        trainStations.add(STASIUN_CITAYAM);
        trainStations.add(STASIUN_DEPOK);
        trainStations.add(STASIUN_DEPOK_BARU);
        trainStations.add(STASIUN_PONDOK_CINA);
        trainStations.add(STASIUN_UNIVERSITAS_INDONESIA);
        trainStations.add(STASIUN_UNIVERSITAS_PANCASILA);
        trainStations.add(STASIUN_LENTENG_AGUNG);
        trainStations.add(STASIUN_TANJUNG_BARAT);
        trainStations.add(STASIUN_PASAR_MINGGU);
        trainStations.add(STASIUN_PASAR_MINGGU_BARU);
        trainStations.add(STASIUN_DUREN_KALIBATA);
        trainStations.add(STASIUN_CAWANG);
        trainStations.add(STASIUN_TEBET);
        trainStations.add(STASIUN_MANGGARAI);
        trainStations.add(STASIUN_SUDIRMAN);
        trainStations.add(STASIUN_TANAH_ABANG);
        trainStations.add(STASIUN_DURI);
        trainStations.add(STASIUN_ANGKE);
        return trainStations;
    }

}
