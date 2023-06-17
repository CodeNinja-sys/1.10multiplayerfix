/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;

public class wz
extends cfc {
    private final File a;

    public wz(File file) {
        this.a = file;
    }

    @Override
    public File a(bpx bpx2) {
        return new File(this.a, bpx2.toString().replace(':', '/'));
    }

    @Override
    public File a() {
        return new File(this.a, "pack.mcmeta");
    }
}

