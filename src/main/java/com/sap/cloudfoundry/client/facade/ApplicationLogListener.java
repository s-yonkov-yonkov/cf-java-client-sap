package com.sap.cloudfoundry.client.facade;

import com.sap.cloudfoundry.client.facade.domain.ApplicationLog;

public interface ApplicationLogListener {
    //add a comment
    void onComplete();

    void onError(Throwable exception);

    void onMessage(ApplicationLog log);

}
