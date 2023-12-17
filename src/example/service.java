package example

import java.util.*;
import arc.*;
import arc.util.Log.*;

public class service{
    public class playerData(){
        public String playerUuid;
        public String playerName;

        public playerData(String name, String uid) {
            this.playerName = name;
            this.playerUuid = uid;
        }

        // service in here
    }

    public class actionFramework{
        public String task;

        public actionFramework(){
            this.task = "empty";
        }
    }

    public class databaseController{

        public databaseController()
    }

    public class databaseDataType{
        public String dataType;

        public databaseDataType(String type){
            switch (type) {
                case "playerData":
                    this.dataType = "playerData";
                case "pd":
                    this.dataType = "playerData";
                case "pdata":
                    this.dataType = "playerData";

                default :
                    this.dataType = "undefined";
                    Log.err("Register database dt not have any case correct. Please check");
            }
        }
    }
}