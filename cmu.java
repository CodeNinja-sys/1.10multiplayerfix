/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;

public class cmu {
    public final File a;
    public final File b;
    public final File c;
    public final String d;

    public cmu(File file, File file2, File file3, String string) {
        this.a = file;
        this.b = file2;
        this.c = file3;
        this.d = string;
    }

    public cfc a() {
        return this.d == null ? new wz(this.c) : new cfc(this.c, this.d);
    }
}

