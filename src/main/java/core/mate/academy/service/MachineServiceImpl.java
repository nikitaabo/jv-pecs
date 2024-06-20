package core.mate.academy.service;

import core.mate.academy.impl.BulldozerProducer;
import core.mate.academy.impl.ExcavatorProducer;
import core.mate.academy.impl.TruckProducer;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class type) {
        MachineProducer<T> producer;
        if (type == Bulldozer.class) {
            producer = (MachineProducer<T>) new BulldozerProducer();
            return producer.get();
        } else if (type == Excavator.class) {
            producer = (MachineProducer<T>) new ExcavatorProducer();
            return producer.get();
        } else if (type == Truck.class) {
            producer = (MachineProducer<T>) new TruckProducer();
            return producer.get();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
