package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.launchcode.techjobs_oo.Job;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

public class JobTest {

    public Job job1;

    public Job job2;

    @Before

    public void initJobObjects()  {

        job1 = new Job();

        job2 = new Job();

    }

    @Test

    public void testSettingJobId()  {

            Job emptyJob1 = new Job();

            Job emptyJob2 = new Job();


            assertFalse(emptyJob1.equals(emptyJob2));


            assertTrue((emptyJob2.getId() - 1) == emptyJob1.getId());

    }

    @Test

    public void testJobConstructorSetsAllFields()  {

        Job jobtest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertEquals(true, jobtest.getName() instanceof String );

        assertEquals(true, jobtest.getEmployer() instanceof Employer );

        assertEquals(true, jobtest.getLocation() instanceof Location );

        assertEquals(true, jobtest.getPositionType() instanceof PositionType );

        assertEquals(true, jobtest.getCoreCompetency() instanceof CoreCompetency );

        assertEquals("Product tester", jobtest.getName() );

        assertEquals("ACME", jobtest.getEmployer().getValue() );

        assertEquals("Desert", jobtest.getLocation().getValue());

        assertEquals("Quality Control", jobtest.getPositionType().getValue());

        assertEquals("Persistence", jobtest.getCoreCompetency().getValue());

    }

    @Test

    public void testJobsForEquality()  {

        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(false, testJob.equals(testJob2));

    }

    @Test

    public void testToString()  {


        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nID: 8\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" , job.toString());

    }


    @Test

    public void testIsDataAvailable() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nID: 2\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" , job.toString());
    }



    @Test

    public void testDoesThisJobExist()  {

        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        assertEquals("OOPS! This job does not seem to exist.", job.toString());

    }


}
