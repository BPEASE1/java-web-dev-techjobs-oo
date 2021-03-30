package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {

        id = nextId;

        nextId++;

    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency)  {

        this();

        name = aName;

        employer = aEmployer;

        location = aLocation;

        positionType = aPositionType;

        coreCompetency = aCoreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override

    public boolean equals(Object o)  {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;

    }

    @Override

    public int hashCode()  {

        return id;

    }


    @Override

    public String toString() {

        if (this.employer.getValue().equals("") && this.name.equals("")

                && this.location.getValue().equals("") && this.positionType.getValue().equals("")

                && this.coreCompetency.getValue().equals("")) {

            return "OOPS! This job does not seem to exist.";

        }

        String nameValue = this.name;

        String employerValue = this.getEmployer().toString();

        String locationValue = this.getLocation().toString();

        String positionTypeValue = this.getPositionType().toString();

        String coreCompetencyValue = this.getCoreCompetency().toString();

        if (this.employer.getValue().equals(""))  {
            employerValue = "Data not available.";
        }

        if (this.name.equals(""))  {
            nameValue = "Data not available.";
        }
        
        if (this.location.getValue() == null || this.location.getValue().equals(""))  {
            locationValue = "Data not available.";
        }

        if (this.positionType.getValue().equals(""))  {
            positionTypeValue = "Data not available.";
        }

        if (this.coreCompetency.getValue().equals(""))  {
            coreCompetencyValue = "Data not available.";
        }

        return "\nID: " + this.id+ "\nName: " + nameValue + "\nEmployer: "
                + employerValue + "\nLocation: " + locationValue
                + "\nPosition Type: " + positionTypeValue
                + "\nCore Competency: " + coreCompetencyValue + "\n";
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId()  {

        return id;

    }

    public String getName()  {

        return name;

    }

    public void setName(String value)  {

        this.name = value;

    }

    public Employer getEmployer()  {

        return employer;

    }

    public void setEmployer(Employer value)  {

        this.employer = value;

    }

    public Location getLocation()  {

        return location;

    }

    public void setLocation(Location value)  {

        this.location = value;

    }

    public PositionType getPositionType()  {

        return positionType;

    }

    public void setPositionType(PositionType value)  {

        this.positionType = value;

    }

    public CoreCompetency getCoreCompetency()  {

        return coreCompetency;

    }

    public void setCoreCompetency(CoreCompetency value)   {

        this.coreCompetency = value;

    }


}
