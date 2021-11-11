import java.util.ArrayList;

public class Test {

    // Driver Code
    public static void main(String[] args)
    {
        String a = "TableInfo{name='Content', columns={IsRemoved=Column{name='IsRemoved', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, RestoreRemark=Column{name='RestoreRemark', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, WaterMark=Column{name='WaterMark', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, ActionStatus=Column{name='ActionStatus', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='0'}, UpdatedBy=Column{name='UpdatedBy', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RUPDATE_=Column{name='RUPDATE_', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RemovedBy=Column{name='RemovedBy', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RestoreBy=Column{name='RestoreBy', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, FileGuId=Column{name='FileGuId', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, LastUpdated=Column{name='LastUpdated', type='TEXT', affinity='2', notNull=true, primaryKeyPosition=0, defaultValue='null'}, IsOffLine=Column{name='IsOffLine', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, Status=Column{name='Status', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, CompanyId=Column{name='CompanyId', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, RemoveRemark=Column{name='RemoveRemark', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, PreviewFile=Column{name='PreviewFile', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, Title=Column{name='Title', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, SortOrder=Column{name='SortOrder', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, FileDuration=Column{name='FileDuration', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, KeyWords=Column{name='KeyWords', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, TitleExt=Column{name='TitleExt', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RestoreDate=Column{name='RestoreDate', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, Type=Column{name='Type', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, DocumentText=Column{name='DocumentText', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, FileType=Column{name='FileType', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RemoveDate=Column{name='RemoveDate', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, LocalUpdate=Column{name='LocalUpdate', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='0'}, ContentId=Column{name='ContentId', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=1, defaultValue='null'}}, foreignKeys=[], indices=[]}";
        String b = "TableInfo{name='Content', columns={IsRemoved=Column{name='IsRemoved', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, ConVersion=Column{name='ConVersion', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RestoreRemark=Column{name='RestoreRemark', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, WaterMark=Column{name='WaterMark', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, ActionStatus=Column{name='ActionStatus', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='0'}, UpdatedBy=Column{name='UpdatedBy', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, VersionCount=Column{name='VersionCount', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, RUPDATE_=Column{name='RUPDATE_', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RemovedBy=Column{name='RemovedBy', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RestoreBy=Column{name='RestoreBy', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, UserRatingCount=Column{name='UserRatingCount', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, FileGuId=Column{name='FileGuId', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, LastUpdated=Column{name='LastUpdated', type='TEXT', affinity='2', notNull=true, primaryKeyPosition=0, defaultValue='null'}, IsOffLine=Column{name='IsOffLine', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, Status=Column{name='Status', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, CompanyId=Column{name='CompanyId', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=0, defaultValue='null'}, RemoveRemark=Column{name='RemoveRemark', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, PreviewFile=Column{name='PreviewFile', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, Title=Column{name='Title', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, SortOrder=Column{name='SortOrder', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='null'}, FileDuration=Column{name='FileDuration', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, KeyWords=Column{name='KeyWords', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, TitleExt=Column{name='TitleExt', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RestoreDate=Column{name='RestoreDate', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, Type=Column{name='Type', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, DocumentText=Column{name='DocumentText', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, FileType=Column{name='FileType', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, RemoveDate=Column{name='RemoveDate', type='TEXT', affinity='2', notNull=false, primaryKeyPosition=0, defaultValue='null'}, LocalUpdate=Column{name='LocalUpdate', type='INTEGER', affinity='3', notNull=false, primaryKeyPosition=0, defaultValue='0'}, ContentId=Column{name='ContentId', type='INTEGER', affinity='3', notNull=true, primaryKeyPosition=1, defaultValue='null'}}, foreignKeys=[], indices=[]}";
        int z=0;
        ArrayList<String> list_a = new ArrayList<>();
        ArrayList<String> list_b = new ArrayList<>();
        String temp = "";
        boolean bool = false;
        for(int x= 6; x<a.length();x++)
        {
            if(bool)
                temp = temp + a.charAt(x);
            else
                if(!temp.equals(""))
                {
                    list_a.add(temp.substring(0,temp.length()-1));
                    temp = "";
                }
            if(a.substring(x-4,x).equals("name"))
                bool = true;
            else
                if(a.charAt(x)==',')
                    bool = false;
        }
        temp = "";
        bool = false;
        for(int x= 6; x<b.length();x++)
        {
            if(bool)
                temp = temp + b.charAt(x);
            else
            if(!temp.equals(""))
            {
                list_b.add(temp.substring(0,temp.length()-1));
                temp = "";
            }
            if(b.substring(x-4,x).equals("name"))
                bool = true;
            else
            if(b.charAt(x)==',')
                bool = false;
        }
        System.out.println(list_a);
        System.out.println(list_b);

        for (String x: list_b) {
            if(!list_a.contains(x))
                System.out.println(x);
        }
//        for(int x=0;x<a.length();x++)
//            if(a.charAt(x)!=b.charAt(x))
//            {System.out.println(x);
//                z = x;
//            break;}

//        System.out.println(a.substring(z-20));
//            System.out.println(b.substring(z-20));
//        System.out.println(a.length());
//        System.out.println(b.length());
    }
}
