package com.ingeus.restMongoSpike;


import static com.ingeus.restMongoSpike.HelperMethods.loadFromClassPath;

import org.junit.Assert;
import org.junit.Test;

import com.ingeus.restMongoSpike.jobs.JobListing;

public class JobListingTestsIT {

    @Test
    public void givenJobListingXMLHasOneJob_whenXMLConvertedToPojo_thenPojoHasOneJob()throws Exception{
        String xml = loadFromClassPath("singleJobOffer.xml");
        JobListing listing = JobListing.fromXML(xml);
        Assert.assertEquals(1, listing.getJobOfferings().size());
    }

    @Test
    public void givenJobListingXMLHasMultipleJobs_whenXMLConvertedToPojo_thenPojoHasOneJob()throws Exception{
        String xml = loadFromClassPath("20150505_QAPA_AVAILABLE_OFFERS.xml");
        JobListing listing = JobListing.fromXML(xml);
           Assert.assertEquals(19314, listing.getJobOfferings().size());
    }

}