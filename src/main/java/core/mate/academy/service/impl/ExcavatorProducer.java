package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> list = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        list.add(excavator1);
        list.add(excavator2);
        return list;
    }
}
