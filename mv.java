/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;

public class mv {
    private bvs a;
    private String b;
    private final List c = ov.a();

    public mv a(bvs bvs2) {
        this.a = bvs2;
        return this;
    }

    public mv a(String string) {
        this.b = string;
        return this;
    }

    public mv a(bvs ... arrbvs) {
        Collections.addAll(this.c, arrbvs);
        return this;
    }

    public ali a() {
        return new ali(this.a, this.b, this.c, null);
    }
}

