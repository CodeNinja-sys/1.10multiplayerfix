/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.apache.commons.c.ao;

public class abl
extends apg {
    private final Object d;
    private Object e;

    public abl(Object object) {
        this.d = object;
    }

    @Override
    public void a(int n2, Object object, Object object2) {
        if (this.d.equals(object)) {
            this.e = object2;
        }
        super.a(n2, object, object2);
    }

    public void a() {
        ao.a(this.e, "Missing default of DefaultedMappedRegistry: " + this.d, new Object[0]);
    }

    @Override
    public int a(Object object) {
        int n2 = super.a(object);
        return n2 == -1 ? super.a(this.e) : n2;
    }

    @Override
    public Object b(Object object) {
        Object object2 = super.b(object);
        return object2 == null ? this.d : object2;
    }

    @Override
    public Object c(Object object) {
        Object object2 = super.c(object);
        return object2 == null ? this.e : object2;
    }

    @Override
    public Object a(int n2) {
        Object object = super.a(n2);
        return object == null ? this.e : object;
    }

    @Override
    public Object a(Random random) {
        Object object = super.a(random);
        return object == null ? this.e : object;
    }
}

