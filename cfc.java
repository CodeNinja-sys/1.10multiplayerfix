/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.d.sz;
import com.a.a.i.bi;
import com.a.b.aa;
import com.a.b.ab;
import com.a.b.z;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cfc {
    private static final d a = c.c();
    private final Map b = sz.c();

    protected cfc() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public cfc(File file, String string) {
        File file2 = new File(file, "objects");
        File file3 = new File(file, "indexes/" + string + ".json");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = bi.a(file3, aj.c);
            z z2 = new ab().a(bufferedReader).t();
            z z3 = cwe.a(z2, "objects", null);
            if (z3 != null) {
                for (Map.Entry entry : z3.b()) {
                    z z4 = (z)entry.getValue();
                    String string2 = (String)entry.getKey();
                    String[] arrstring = string2.split("/", 2);
                    String string3 = arrstring.length == 1 ? arrstring[0] : arrstring[0] + ":" + arrstring[1];
                    String string4 = cwe.f(z4, "hash");
                    File file4 = new File(file2, string4.substring(0, 2) + "/" + string4);
                    this.b.put(string3, file4);
                }
            }
        }
        catch (aa aa2) {
            a.b("Unable to parse resource index file: {}", file3);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.b("Can't find the resource index file: {}", file3);
        }
        finally {
            t.a(bufferedReader);
        }
    }

    public File a(bpx bpx2) {
        String string = bpx2.toString();
        return (File)this.b.get(string);
    }

    public boolean b(bpx bpx2) {
        File file = this.a(bpx2);
        return file != null && file.isFile();
    }

    public File a() {
        return (File)this.b.get("pack.mcmeta");
    }
}

