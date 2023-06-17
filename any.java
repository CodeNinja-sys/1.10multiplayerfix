/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

final class any
extends c {
    @Override
    public void a(alj alj2, cmd cmd2, List list, int n2, cmz cmz2) {
        if (n2 >= 100) {
            cmd2.a(e);
            cmd2.f();
            for (abi abi2 : list) {
                abi2.a((cmz)null);
                alj2.a(abi2, abi2.aU, abi2.aV, abi2.aW, 6.0f, false);
                abi2.ak_();
            }
        } else if (n2 >= 80) {
            alj2.b(3001, new cmz(0, 128, 0), 0);
        } else if (n2 == 0) {
            for (abi abi3 : list) {
                abi3.a(new cmz(0, 128, 0));
            }
        } else if (n2 < 5) {
            alj2.b(3001, new cmz(0, 128, 0), 0);
        }
    }
}

