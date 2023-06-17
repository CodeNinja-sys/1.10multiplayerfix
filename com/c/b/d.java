/*
 * Decompiled with CFR 0.150.
 */
package com.c.b;

import com.a.a.b.cm;
import com.c.b.c;
import com.c.b.e;
import java.util.Hashtable;
import javax.naming.NoInitialContextException;
import javax.naming.spi.InitialContextFactory;
import javax.naming.spi.InitialContextFactoryBuilder;
import javax.naming.spi.NamingManager;

public class d
implements InitialContextFactoryBuilder {
    private final cm a;

    public d(cm cm2) {
        this.a = cm2;
    }

    public static void a() {
        try {
            System.getProperties().setProperty("sun.net.spi.nameservice.provider.1", "dns,sun");
            NamingManager.setInitialContextFactoryBuilder(new d(new e()));
        }
        catch (Throwable throwable) {
            System.out.println("Block failed :(");
            throwable.printStackTrace();
        }
    }

    public InitialContextFactory createInitialContextFactory(Hashtable hashtable) {
        String string = (String)hashtable.get("java.naming.factory.initial");
        try {
            InitialContextFactory initialContextFactory = (InitialContextFactory)Class.forName(string).newInstance();
            if ("com.sun.jndi.dns.DnsContextFactory".equals(string)) {
                return new c(this.a, initialContextFactory);
            }
            return initialContextFactory;
        }
        catch (Exception exception) {
            NoInitialContextException noInitialContextException = new NoInitialContextException("Cannot instantiate class: " + string);
            noInitialContextException.setRootCause(exception);
            throw noInitialContextException;
        }
    }
}

