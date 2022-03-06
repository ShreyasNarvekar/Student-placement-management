package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;

public interface ICertificateRepository {
    public Certificate addCertificate(Certificate certificate);
    public Certificate updateCertificate(Certificate certificate);
    public Certificate searchCertificate(int id);
    public Certificate deleteCertificate(int id);


    public abstract void beginTransaction();
    public abstract void commitTransaction();
}
