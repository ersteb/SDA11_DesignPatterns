package main.java.decorator;

class Main {
    public static void main(String[] args) {
        Room basicScheduleRoom = new ScheduleRoom.ScheduleRoomBuilder(2, 3).build();

        Room partyRoom = new PartyRoomDecorator(basicScheduleRoom);
        Room escapeRoom = new EscapeRoomDecorator(basicScheduleRoom);
        
        Room partyEscapeRoom = new PartyRoomDecorator(escapeRoom);
        
        partyRoom.meeting();
        System.out.println("*******************************");
        escapeRoom.meeting();
   
        System.out.println("*******************************");
        partyEscapeRoom.meeting();
    }
}
