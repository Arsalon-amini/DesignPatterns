package com.codeWithArsalon.Adapter;

import com.codeWithArsalon.Adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    //This class uses inheritance
    //this approach is not as flexible as composition
    //a class can only have a single parent (if abstract class, couldn't extend two

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
