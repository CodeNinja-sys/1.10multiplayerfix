/*
 * Decompiled with CFR 0.150.
 */
import e.a.o;
import e.a.p;
import e.a.u;

class crc
extends o {
    final /* synthetic */ atz a;

    private crc(atz atz2) {
        this.a = atz2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(String string) {
        Object object = p.a;
        synchronized (object) {
            if (this.c == null) {
                return false;
            }
            u u2 = (u)this.c.m().get(string);
            if (u2 == null) {
                return false;
            }
            return u2.t() || u2.v() || u2.z;
        }
    }

    /* synthetic */ crc(atz atz2, axo axo2) {
        this(atz2);
    }
}

