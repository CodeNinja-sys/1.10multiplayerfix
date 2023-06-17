/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bnm
implements aoi,
czj {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Map b = sz.c();
    private final List c = ov.a();
    private final Map d = sz.c();
    private final akx e;

    public bnm(akx akx2) {
        this.e = akx2;
    }

    public void a(bpx bpx2) {
        dfs dfs2 = (dfs)this.b.get(bpx2);
        if (dfs2 == null) {
            dfs2 = new coi(bpx2);
            this.a(bpx2, dfs2);
        }
        anq.b(dfs2.aF_());
    }

    public boolean a(bpx bpx2, zo zo2) {
        if (this.a(bpx2, (dfs)zo2)) {
            this.c.add(zo2);
            return true;
        }
        return false;
    }

    public boolean a(bpx bpx2, dfs dfs2) {
        boolean bl2 = true;
        try {
            dfs2.a(this.e);
        }
        catch (IOException iOException) {
            a.f("Failed to load texture: {}", bpx2, iOException);
            dfs2 = anq.a;
            this.b.put(bpx2, dfs2);
            bl2 = false;
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Registering texture");
            sx sx2 = cet2.a("Resource location being registered");
            dfs dfs3 = dfs2;
            sx2.a("Resource location", bpx2);
            sx2.a("Texture object class", new cqr(this, dfs3));
            throw new oz(cet2);
        }
        this.b.put(bpx2, dfs2);
        return bl2;
    }

    public dfs b(bpx bpx2) {
        return (dfs)this.b.get(bpx2);
    }

    public bpx a(String string, cze cze2) {
        Object object;
        Integer n2 = (Integer)this.d.get(string);
        if (n2 == null) {
            n2 = 1;
        } else {
            object = n2;
            Integer n3 = n2 = Integer.valueOf(n2 + 1);
        }
        this.d.put(string, n2);
        object = new bpx(String.format("dynamic/%s_%d", string, n2));
        this.a((bpx)object, (dfs)cze2);
        return object;
    }

    @Override
    public void a() {
        for (czj czj2 : this.c) {
            czj2.a();
        }
    }

    public void c(bpx bpx2) {
        dfs dfs2 = this.b(bpx2);
        if (dfs2 != null) {
            anq.a(dfs2.aF_());
        }
    }

    @Override
    public void a(akx akx2) {
        for (Map.Entry entry : this.b.entrySet()) {
            this.a((bpx)entry.getKey(), (dfs)entry.getValue());
        }
    }
}

