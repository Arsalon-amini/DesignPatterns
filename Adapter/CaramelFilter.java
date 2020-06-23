package com.codeWithArsalon.Adapter;

import com.codeWithArsalon.Adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
    //This class uses composition in the Adapter Pattern

    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
