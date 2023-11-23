package Country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentContinentBinding binding;
    private Integer position;
    private ArrayList<Country.CountryModel> countryModels = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.recyclerView.setAdapter(countryAdapter);
    }

    private void checkPosition(int position) {
        if (position == 0) {
            loadEurasia();
        } else if (position == 1) {
            loadNorthAmerica();
        } else if (position == 2) {
            loadSouthAmerica();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 4) {
            loadAustralia();
        }
    }



    private void loadAfrica() {
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ss-1-580x290.png.webp", "South Sudan"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/et-1-580x290.png.webp", "Ethiopia "));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/td-1-580x387.png.webp", "Tchad"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/gq-1-580x387.png.webp", "Guiné Equatorial"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ug-1-580x387.png.webp", "Uganda"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tn-1-580x387.png.webp", "Tunisia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/sd-1-580x290.png.webp", "Sudan"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/rw-1-580x387.png.webp", "Rwanda"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tg-1-580x358.png.webp", "Togo"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ng-1-580x290.png.webp", "Nigeria"));
    }

    private void loadSouthAmerica() {
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cl-1-580x387.png.webp", "Chile"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ec-1-580x290.png.webp", "Ecuador"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/uy-1-580x387.png.webp", "Uruguay"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pe-1-580x387.png.webp", "Peru"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/py-1-580x348.png.webp", "Paraguay"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/co-1-580x387.png.webp", "Columbia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/br-1-580x406.png.webp", "Brazil"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ve-1-580x387.png.webp", "Venezuela"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ar-580x373.png.webp", "Argentina"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/bo-1-580x395.png.webp", "Bolivia"));
    }

    private void loadNorthAmerica() {
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/jm-1-580x290.png.webp", "Jamaica"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tt-1-580x348.png.webp", "Trinidad and Tobago"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/us-1-580x305.png.webp", "USA"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/lc-1-580x290.png.webp", "Saint Lucia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/vc-1-580x387.png.webp", "Saint Vincent and Grenadines "));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kn-1-580x387.png.webp", "Saint Kitts and Nevis"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ca-1-580x290.png.webp", "Canada"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cu-2-580x290.png.webp", "Cuba"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pa-1-580x387.png.webp", "Panama"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/dm-580x290.png.webp", "Dominica"));
    }

    private void loadEurasia() {
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kg-1-580x348.png.webp", "Kyrgyzstan "));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/jp-1-580x387.png.webp", "Japan"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/south-ossetia-1-580x290.png.webp", "South Ossetia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kr-1-580x387.png.webp", "South Korea"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ee-1-580x369.png.webp", "Estonia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/fr-580x387.png.webp", "France"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/lk-1-580x290.png.webp", "Sri Lanka"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ch-1-580x580.png.webp", "Switzerland "));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tr-1-580x387.png.webp", "Turkey"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cz-1-580x387.png.webp", "Czechia"));
    }
    private void loadAustralia() {
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_New_South_Wales.svg/800px-Flag_of_New_South_Wales.svg.png", "New South Wales"));
        countryModels.add(new CountryModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Victoria_%28Australia%29.svg/255px-Flag_of_Victoria_%28Australia%29.svg.png", "Victoria"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/sb-1-580x290.png.webp", "Solomon Islands"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ws-1-580x290.png.webp", "Samoa"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/nz-1-580x290.png.webp", "New Zealand"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/fm-1-580x305.png.webp", "Federated States of Micronesia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/vu-1-580x348.png.webp", "Vanuatu"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/au-768x384.png.webp", "Australia"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pw-1-580x363.png.webp", " Palau"));
        countryModels.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/nr-1-580x290.png.webp", "Nauru"));
    }
}
