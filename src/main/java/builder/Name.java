package builder;

import java.util.List;

public class Name {
    private String firstName;
    private List<String> middleNames;
    private String surname;
    private Name(Builder builder){

    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleNames=" + middleNames +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private List<String> middleNames;
        private String surname;

        public Builder firstName(final String firstName){
            this.firstName=firstName;
            return this;
        }
        public Builder middleNames(final List<String> middleNames){
            this.middleNames=middleNames;
            return this;
        }
        public Builder surname(final String surname){
            this.surname=surname;
            return this;
        }
        public Name build(){
            return new Name(this);
        }


    }
}
