/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

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
import net.minecraft.u.bc;
import net.minecraft.u.bp;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;

public class d {
    private static final org.apache.logging.log4j.d a = c.c();
    private final Map b;

    protected d() {
        this.b = sz.c();
    }

    public d(File file, String string) {
        block8: {
            this.b = sz.c();
            File file2 = new File(file, "objects");
            File file3 = new File(file, "indexes/" + string + ".json");
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = bi.a(file3, aj.c);
                z z2 = new ab().a(bufferedReader).t();
                z z3 = bc.a(z2, "objects", null);
                if (z3 != null) {
                    for (Map.Entry entry : z3.b()) {
                        z z4 = (z)entry.getValue();
                        String string2 = (String)entry.getKey();
                        String[] arrstring = string2.split("/", 2);
                        String string3 = arrstring.length == 1 ? arrstring[0] : String.valueOf(arrstring[0]) + ":" + arrstring[1];
                        String string4 = bc.f(z4, "hash");
                        File file4 = new File(file2, String.valueOf(string4.substring(0, 2)) + "/" + string4);
                        this.b.put(string3, file4);
                    }
                }
            }
            catch (aa aa2) {
                a.b("Unable to parse resource index file: {}", file3);
                t.a(bufferedReader);
                break block8;
            }
            catch (FileNotFoundException fileNotFoundException) {
                try {
                    a.b("Can't find the resource index file: {}", file3);
                }
                catch (Throwable throwable) {
                    t.a(bufferedReader);
                    throw throwable;
                }
                t.a(bufferedReader);
                break block8;
            }
            t.a(bufferedReader);
        }
    }

    public File a(bp bp2) {
        String string = bp2.toString();
        return (File)this.b.get(string);
    }

    public boolean b(bp bp2) {
        File file = this.a(bp2);
        return file != null && file.isFile();
    }

    public File a() {
        return (File)this.b.get("pack.mcmeta");
    }
}

