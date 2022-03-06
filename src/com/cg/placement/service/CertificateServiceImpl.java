package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.CertificateRepositoryImpl;
import com.cg.placement.repository.ICertificateRepository;

import javax.transaction.Transactional;


public class CertificateServiceImpl implements ICertificateService{
    private final ICertificateRepository dao;
    public CertificateServiceImpl(){
         dao = new CertificateRepositoryImpl();
    }


    @Override
    public Certificate addCertificate(Certificate certificate) {
        dao.beginTransaction();
        dao.addCertificate(certificate);
        dao.commitTransaction();
        return certificate;
    }

    @Override
    public Certificate updateCertificate(Certificate certificate) {
        dao.beginTransaction();
        dao.updateCertificate(certificate);
        dao.commitTransaction();
        return certificate;
    }

    @Override
    public Certificate searchCertificate(int id) {
        return dao.searchCertificate(id);
    }

    @Override
    public Certificate deleteCertificate(int id) {
        Certificate certificate=dao.searchCertificate(id);
        dao.beginTransaction();
        dao.deleteCertificate(id);
        dao.commitTransaction();
        return certificate;

    }
}
