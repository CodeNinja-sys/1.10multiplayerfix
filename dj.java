/*
 * Decompiled with CFR 0.150.
 */
import e.a.t;

class dj
extends t {
    final /* synthetic */ axo a;

    dj(axo axo2) {
        this.a = axo2;
    }

    @Override
    public void a(String string, int n2) {
        if (!string.isEmpty()) {
            atz.g().d(string);
        }
    }

    @Override
    public void b(String string, int n2) {
        if (!string.isEmpty()) {
            atz.g().f(string);
        }
    }

    @Override
    public void a(String string, String string2, int n2) {
        if (!string2.isEmpty()) {
            atz.g().b("Error in class '{}'", string);
            atz.g().b(string2);
        }
    }
}

