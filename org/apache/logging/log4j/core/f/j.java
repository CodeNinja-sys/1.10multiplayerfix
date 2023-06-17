/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.Executor;
import javax.management.MBeanServer;
import org.apache.logging.log4j.core.f.i;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.d.d;

final class j
implements PropertyChangeListener {
    final /* synthetic */ k a;
    final /* synthetic */ MBeanServer b;
    final /* synthetic */ Executor c;

    j(k k2, MBeanServer mBeanServer, Executor executor) {
        this.a = k2;
        this.b = mBeanServer;
        this.c = executor;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (!"config".equals(propertyChangeEvent.getPropertyName())) {
            return;
        }
        i.a(this.a, this.b);
        i.b(this.a, this.b);
        try {
            i.a(this.a, this.b, this.c);
            i.b(this.a, this.b, this.c);
        }
        catch (Exception exception) {
            d.k().b("Could not register mbeans", (Throwable)exception);
        }
    }
}

