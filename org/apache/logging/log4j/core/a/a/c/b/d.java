/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mongodb.DB
 *  com.mongodb.MongoClient
 *  com.mongodb.ServerAddress
 *  com.mongodb.WriteConcern
 */
package org.apache.logging.log4j.core.a.a.c.b;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import org.apache.logging.log4j.core.a.a.c.b;
import org.apache.logging.log4j.core.a.a.c.b.a;
import org.apache.logging.log4j.core.a.a.c.h;
import org.apache.logging.log4j.core.d.r;

public final class d
implements h {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final DB c;
    private final String d;
    private final WriteConcern e;

    private d(DB dB, WriteConcern writeConcern, String string, String string2) {
        this.c = dB;
        this.e = writeConcern;
        this.b = string;
        this.d = "mongoDb{ " + string2 + " }";
    }

    public a b() {
        return new a(this.c, this.e, this.b);
    }

    @Override
    public String toString() {
        return this.d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static d a(String var0, String var1_1, String var2_2, String var3_3, String var4_4, String var5_5, String var6_6, String var7_7, String var8_8, String var9_9) {
        block22: {
            if (var8_8 == null || var8_8.length() <= 0 || var9_9 == null || var9_9.length() <= 0) break block22;
            try {
                block24: {
                    block23: {
                        var12_10 = Class.forName(var8_8);
                        var13_16 = var12_10.getMethod(var9_9, new Class[0]);
                        var14_18 = var13_16.invoke(null, new Object[0]);
                        if (!(var14_18 instanceof DB)) break block23;
                        var10_19 = (DB)var14_18;
                        break block24;
                    }
                    if (!(var14_18 instanceof MongoClient)) ** GOTO lbl16
                    if (var3_3 != null && var3_3.length() > 0) {
                        var10_19 = ((MongoClient)var14_18).getDB(var3_3);
                    } else {
                        org.apache.logging.log4j.core.a.a.c.b.d.a.b("The factory method [{}.{}()] returned a MongoClient so the database name is required.", new Object[]{var8_8, var9_9});
                        return null;
lbl16:
                        // 1 sources

                        if (var14_18 == null) {
                            org.apache.logging.log4j.core.a.a.c.b.d.a.b("The factory method [{}.{}()] returned null.", new Object[]{var8_8, var9_9});
                            return null;
                        }
                        org.apache.logging.log4j.core.a.a.c.b.d.a.b("The factory method [{}.{}()] returned an unsupported type [{}].", new Object[]{var8_8, var9_9, var14_18.getClass().getName()});
                        return null;
                    }
                }
                var11_20 = "database=" + var10_19.getName();
                var15_21 = var10_19.getMongo().getAllAddress();
                if (var15_21.size() == 1) {
                    var11_20 = var11_20 + ", server=" + ((ServerAddress)var15_21.get(0)).getHost() + ", port=" + ((ServerAddress)var15_21.get(0)).getPort();
                }
                var11_20 = var11_20 + ", servers=[";
                for (ServerAddress var17_23 : var15_21) {
                    var11_20 = var11_20 + " { " + var17_23.getHost() + ", " + var17_23.getPort() + " } ";
                }
                var11_20 = var11_20 + "]";
            }
            catch (ClassNotFoundException var12_11) {
                org.apache.logging.log4j.core.a.a.c.b.d.a.b("The factory class [{}] could not be loaded.", new Object[]{var8_8, var12_11});
                return null;
            }
            catch (NoSuchMethodException var12_12) {
                org.apache.logging.log4j.core.a.a.c.b.d.a.b("The factory class [{}] does not have a no-arg method named [{}].", new Object[]{var8_8, var9_9, var12_12});
                return null;
            }
            catch (Exception var12_13) {
                org.apache.logging.log4j.core.a.a.c.b.d.a.b("The factory method [{}.{}()] could not be invoked.", new Object[]{var8_8, var9_9, var12_13});
                return null;
            }
        }
        if (var3_3 != null && var3_3.length() > 0) {
            var11_20 = "database=" + var3_3;
            try {
                if (var4_4 != null && var4_4.length() > 0) {
                    var12_14 = org.apache.logging.log4j.core.a.a.a(var5_5, 0);
                    var11_20 = var11_20 + ", server=" + var4_4;
                    if (var12_14 > 0) {
                        var11_20 = var11_20 + ", port=" + var12_14;
                        var10_19 = new MongoClient(var4_4, var12_14).getDB(var3_3);
                    }
                    var10_19 = new MongoClient(var4_4).getDB(var3_3);
                }
                var10_19 = new MongoClient().getDB(var3_3);
            }
            catch (Exception var12_15) {
                org.apache.logging.log4j.core.a.a.c.b.d.a.b("Failed to obtain a database instance from the MongoClient at server [{}] and port [{}].", new Object[]{var4_4, var5_5});
                return null;
            }
        } else {
            org.apache.logging.log4j.core.a.a.c.b.d.a.b("No factory method was provided so the database name is required.");
            return null;
        }
        if (!var10_19.isAuthenticated()) {
            if (var6_6 != null && var6_6.length() > 0 && var7_7 != null && var7_7.length() > 0) {
                var11_20 = var11_20 + ", username=" + var6_6 + ", passwordHash=" + r.b(var7_7 + d.class.getName());
                org.apache.logging.log4j.core.a.a.c.b.a.a(var10_19, var6_6, var7_7);
            } else {
                org.apache.logging.log4j.core.a.a.c.b.d.a.b("The database is not already authenticated so you must supply a username and password for the MongoDB provider.");
                return null;
            }
        }
        if (var1_1 != null && var1_1.length() > 0) {
            if (var2_2 != null && var2_2.length() > 0) {
                try {
                    var13_16 = Class.forName(var2_2);
                    var14_18 = var13_16.getField(var1_1);
                    var12_10 = (WriteConcern)var14_18.get(null);
                    return new d(var10_19, var12_10, var0, var11_20);
                }
                catch (Exception var13_17) {
                    org.apache.logging.log4j.core.a.a.c.b.d.a.b("Write concern constant [{}.{}] not found, using default.", new Object[]{var2_2, var1_1});
                    var12_10 = WriteConcern.ACKNOWLEDGED;
                    return new d(var10_19, var12_10, var0, var11_20);
                }
            }
            var12_10 = WriteConcern.valueOf((String)var1_1);
            if (var12_10 != null) return new d(var10_19, var12_10, var0, var11_20);
            org.apache.logging.log4j.core.a.a.c.b.d.a.f("Write concern constant [{}] not found, using default.", new Object[]{var1_1});
            var12_10 = WriteConcern.ACKNOWLEDGED;
            return new d(var10_19, var12_10, var0, var11_20);
        }
        var12_10 = WriteConcern.ACKNOWLEDGED;
        return new d(var10_19, var12_10, var0, var11_20);
    }

    @Override
    public /* synthetic */ b a() {
        return this.b();
    }
}

