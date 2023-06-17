/*
 * Decompiled with CFR 0.150.
 */
import e.a.p;

class axo
implements Runnable {
    final /* synthetic */ atz a;

    axo(atz atz2) {
        this.a = atz2;
    }

    @Override
    public void run() {
        p.a(new dj(this));
        atz.a(this.a, new crc(this.a, null));
        atz.a(this.a, true);
        atz.b(this.a).e(atz.a(this.a).a(csg.a));
        atz.g().d(atz.h(), "Sound engine started");
    }
}

