/*
 * Decompiled with CFR 0.150.
 */
public class bbx
extends dai {
    private final Object a;

    public bbx(Object object) {
        this.a = object;
    }

    @Override
    public Object c(Object object) {
        Object object2 = super.c(object);
        return object2 == null ? this.a : object2;
    }
}

