/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cn;
import com.a.a.d.cm;
import com.a.a.d.ov;
import java.util.Collection;

public class yc
extends byc {
    protected yc(String string, Collection collection) {
        super(string, bqk.class, collection);
    }

    public static yc b(String string) {
        return yc.a(string, cn.a());
    }

    public static yc a(String string, com.a.a.b.cm cm2) {
        return yc.a(string, cm.a((Collection)ov.a(bqk.values()), cm2));
    }

    public static yc a(String string, Collection collection) {
        return new yc(string, collection);
    }
}

