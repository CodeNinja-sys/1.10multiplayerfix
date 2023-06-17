/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;

public class bzn
extends g {
    public bzn(File file, String string, boolean bl2, cgy cgy2) {
        super(file, string, bl2, cgy2);
    }

    @Override
    public dab a(byf byf2) {
        File file = this.a();
        if (byf2 instanceof cer) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new aqz(file2, this.a);
        }
        if (byf2 instanceof cup) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new aqz(file3, this.a);
        }
        return new aqz(file, this.a);
    }

    @Override
    public void a(cvn cvn2, bvp bvp2) {
        cvn2.d(19133);
        super.a(cvn2, bvp2);
    }

    @Override
    public void f() {
        try {
            agw.a().b();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        ov.a();
    }
}

