/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

public class na
implements cm {
    private final ahk a;

    private na(ahk ahk2) {
        this.a = ahk2;
    }

    public static na a(ahk ahk2) {
        return new na(ahk2);
    }

    public boolean a(dbk dbk2) {
        return dbk2 != null && dbk2.a() == this.a;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((dbk)object);
    }
}

