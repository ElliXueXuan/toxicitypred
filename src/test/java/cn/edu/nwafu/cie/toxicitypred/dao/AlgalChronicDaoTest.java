package cn.edu.nwafu.cie.toxicitypred.dao;

import cn.edu.nwafu.cie.toxicitypred.entities.AlgalChronic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgalChronicDaoTest {

    @Autowired
    private AlgalChronicDao algalChronicDao;

    @Test
    public void getAll() {
        List<AlgalChronic> algalChronicList = algalChronicDao.getAll();
        System.out.println(algalChronicList.size());
        //assertEquals(2,algalChronicList.size());
    }

    @Test
    public void getByCasNo() {
        AlgalChronic algalChronic = new AlgalChronic();
        algalChronic = algalChronicDao.getByCasNo("000067-48-1");
        System.out.println(algalChronic.getSmiles());
    }
}