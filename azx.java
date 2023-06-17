/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public class azx
implements akc {
    @Override
    public int a() {
        return 108;
    }

    @Override
    public bvp a(bvp bvp2) {
        if (bvp2.b("UUID", 8)) {
            bvp2.a("UUID", UUID.fromString(bvp2.l("UUID")));
        }
        return bvp2;
    }
}

